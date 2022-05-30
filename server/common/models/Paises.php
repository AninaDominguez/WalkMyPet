<?php

namespace common\models;

use Yii;

/**
 * This is the model class for table "paises".
 *
 * @property int $id
 * @property string $Codigo
 * @property string $Nombre
 */
class Paises extends \yii\db\ActiveRecord
{
    /**
     * {@inheritdoc}
     */
    public static function tableName()
    {
        return 'paises';
    }

    /**
     * {@inheritdoc}
     */
    public function rules()
    {
        return [
            [['id', 'Codigo', 'Nombre'], 'required'],
            [['id'], 'integer'],
            [['Codigo'], 'string', 'max' => 2],
            [['Nombre'], 'string', 'max' => 120],
        ];
    }

    /**
     * {@inheritdoc}
     */
    public function attributeLabels()
    {
        return [
            'id' => Yii::t('app', 'ID'),
            'Codigo' => Yii::t('app', 'Codigo'),
            'Nombre' => Yii::t('app', 'Nombre'),
        ];
    }
}
