<?php

namespace common\models;

use Yii;

/**
 * This is the model class for table "tarifas".
 *
 * @property int $id
 * @property float $duracion
 * @property float $precio
 */
class Tarifas extends \yii\db\ActiveRecord
{
    /**
     * {@inheritdoc}
     */
    public static function tableName()
    {
        return 'tarifas';
    }

    /**
     * {@inheritdoc}
     */
    public function rules()
    {
        return [
            [['duracion', 'precio'], 'required'],
            [['duracion', 'precio'], 'number'],
        ];
    }

    /**
     * {@inheritdoc}
     */
    public function attributeLabels()
    {
        return [
            'id' => Yii::t('app', 'ID'),
            'duracion' => Yii::t('app', 'Duracion'),
            'precio' => Yii::t('app', 'Precio'),
        ];
    }
}
