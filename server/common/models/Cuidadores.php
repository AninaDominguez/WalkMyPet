<?php

namespace common\models;

use Yii;

/**
 * This is the model class for table "cuidadores".
 *
 * @property int $id
 * @property string $Nombre
 * @property string $password
 *
 * @property Servicios[] $servicios
 */
class Cuidadores extends \yii\db\ActiveRecord
{
    /**
     * {@inheritdoc}
     */
    public static function tableName()
    {
        return 'cuidadores';
    }

    /**
     * {@inheritdoc}
     */
    public function rules()
    {
        return [
            [['Nombre', 'password'], 'required'],
            [['Nombre'], 'string', 'max' => 120],
            [['password'], 'string', 'max' => 50],
        ];
    }

    /**
     * {@inheritdoc}
     */
    public function attributeLabels()
    {
        return [
            'id' => Yii::t('app', 'ID'),
            'Nombre' => Yii::t('app', 'Nombre'),
            'password' => Yii::t('app', 'Password'),
        ];
    }

    /**
     * Gets query for [[Servicios]].
     *
     * @return \yii\db\ActiveQuery
     */
    public function getServicios()
    {
        return $this->hasMany(Servicios::className(), ['cuidador' => 'id']);
    }
}
