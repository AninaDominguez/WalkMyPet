<?php

use yii\helpers\Html;

/* @var $this yii\web\View */
/* @var $model common\models\Cuidadores */

$this->title = 'Create Cuidadores';
$this->params['breadcrumbs'][] = ['label' => 'Cuidadores', 'url' => ['index']];
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="cuidadores-create">

    <h1><?= Html::encode($this->title) ?></h1>

    <?= $this->render('_form', [
        'model' => $model,
    ]) ?>

</div>
