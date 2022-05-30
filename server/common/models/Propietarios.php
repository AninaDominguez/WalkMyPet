<?php

namespace common\models;

use Yii;

/**
 * This is the model class for table "propietarios".
 *
 * @property int $id
 * @property string $Nombre
 * @property string $password
 *
 * @property Mascotas[] $mascotas
 */
class Propietarios extends \yii\db\ActiveRecord
{
    /**
     * {@inheritdoc}
     */
    public static function tableName()
    {
        return 'propietarios';
    }

    /**
     * {@inheritdoc}
     */
    public function rules()
    {
        return [
            [['Nombre', 'password'], 'required'],
            [['Nombre'], 'string', 'max' => 120],
            [['password'], 'string', 'max' => 20],
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
     * Gets query for [[Mascotas]].
     *
     * @return \yii\db\ActiveQuery
     */
    public function getMascotas()
    {
        return $this->hasMany(Mascotas::className(), ['propietario' => 'id']);
    }
}
