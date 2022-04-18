<?php
namespace api\modules\v1\controllers;
use yii\rest\ActiveController;

class MascotasController extends ActiveController {
    public $modelClass = 'common\models\Mascotas';
}