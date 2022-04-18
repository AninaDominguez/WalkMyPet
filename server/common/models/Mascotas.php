<?php

namespace common\models;

use Yii;

/**
 * This is the model class for table "mascotas".
 *
 * @property int $id
 * @property int $propietario
 * @property string $Nombre
 *
 * @property Propietarios $propietario0
 * @property Servicios[] $servicios
 */
class Mascotas extends \yii\db\ActiveRecord
{
    /**
     * {@inheritdoc}
     */
    public static function tableName()
    {
        return 'mascotas';
    }

    /**
     * {@inheritdoc}
     */
    public function rules()
    {
        return [
            [['propietario', 'Nombre'], 'required'],
            [['propietario'], 'integer'],
            [['Nombre'], 'string', 'max' => 120],
            [['propietario'], 'exist', 'skipOnError' => true, 'targetClass' => Propietarios::className(), 'targetAttribute' => ['propietario' => 'id']],
        ];
    }

    /**
     * {@inheritdoc}
     */
    public function attributeLabels()
    {
        return [
            'id' => Yii::t('app', 'ID'),
            'propietario' => Yii::t('app', 'Propietario'),
            'Nombre' => Yii::t('app', 'Nombre'),
        ];
    }

    /**
     * Gets query for [[Propietario0]].
     *
     * @return \yii\db\ActiveQuery
     */
    public function getPropietario0()
    {
        return $this->hasOne(Propietarios::className(), ['id' => 'propietario']);
    }

    /**
     * Gets query for [[Servicios]].
     *
     * @return \yii\db\ActiveQuery
     */
    public function getServicios()
    {
        return $this->hasMany(Servicios::className(), ['mascota' => 'id']);
    }
}
