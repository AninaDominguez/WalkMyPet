<?php

namespace common\models;

use Yii;

/**
 * This is the model class for table "servicios".
 *
 * @property int $id
 * @property int $cuidador
 * @property int $mascota
 * @property string $fecha
 * @property float $duracion
 * @property string $nombre
 *
 * @property Cuidadores $cuidador0
 * @property Mascotas $mascota0
 */
class Servicios extends \yii\db\ActiveRecord
{
    /**
     * {@inheritdoc}
     */
    public static function tableName()
    {
        return 'servicios';
    }

    /**
     * {@inheritdoc}
     */
    public function rules()
    {
        return [
            [['cuidador', 'mascota', 'fecha', 'duracion', 'nombre'], 'required'],
            [['cuidador', 'mascota'], 'integer'],
            [['fecha'], 'safe'],
            [['duracion'], 'number'],
            [['nombre'], 'string', 'max' => 80],
            [['cuidador'], 'exist', 'skipOnError' => true, 'targetClass' => Cuidadores::className(), 'targetAttribute' => ['cuidador' => 'id']],
            [['mascota'], 'exist', 'skipOnError' => true, 'targetClass' => Mascotas::className(), 'targetAttribute' => ['mascota' => 'id']],
        ];
    }

    /**
     * {@inheritdoc}
     */
    public function attributeLabels()
    {
        return [
            'id' => Yii::t('app', 'ID'),
            'cuidador' => Yii::t('app', 'Cuidador'),
            'mascota' => Yii::t('app', 'Mascota'),
            'fecha' => Yii::t('app', 'Fecha'),
            'duracion' => Yii::t('app', 'Duracion'),
            'nombre' => Yii::t('app', 'Nombre'),
        ];
    }

    /**
     * Gets query for [[Cuidador0]].
     *
     * @return \yii\db\ActiveQuery
     */
    public function getCuidador0()
    {
        return $this->hasOne(Cuidadores::className(), ['id' => 'cuidador']);
    }

    /**
     * Gets query for [[Mascota0]].
     *
     * @return \yii\db\ActiveQuery
     */
    public function getMascota0()
    {
        return $this->hasOne(Mascotas::className(), ['id' => 'mascota']);
    }
}
