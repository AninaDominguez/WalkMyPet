<?php

use yii\helpers\Html;
use yii\widgets\ActiveForm;

/* @var $this yii\web\View */
/* @var $model common\models\Servicios */
/* @var $form yii\widgets\ActiveForm */
?>

<div class="servicios-form">

    <?php $form = ActiveForm::begin(); ?>

    <?= $form->field($model, 'cuidador')->textInput() ?>

    <?= $form->field($model, 'mascota')->textInput() ?>

    <?= $form->field($model, 'fecha')->textInput() ?>

    <?= $form->field($model, 'duracion')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'nombre')->textInput(['maxlength' => true]) ?>

    <div class="form-group">
        <?= Html::submitButton('Save', ['class' => 'btn btn-success']) ?>
    </div>

    <?php ActiveForm::end(); ?>

</div>
