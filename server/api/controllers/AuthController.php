<?php
namespace api\controllers;
use Yii;
use yii\rest\Controller;

class AuthController extends Controller {
    public function actionLogin() {
        return ["name" => "Saul", "surname" => "Tenesaca", "age" => 22];
    }
}
