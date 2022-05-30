<?php

use common\models\Propietarios;
use yii\helpers\Html;
use yii\helpers\Url;
use yii\grid\ActionColumn;
use yii\grid\GridView;

/* @var $this yii\web\View */
/* @var $searchModel common\models\PropietariosSearch */
/* @var $dataProvider yii\data\ActiveDataProvider */

$this->title = 'Propietarios';
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="propietarios-index">

    <h1><?= Html::encode($this->title) ?></h1>

    <p>
        <?= Html::a('Create Propietarios', ['create'], ['class' => 'btn btn-success']) ?>
    </p>

    <?php // echo $this->render('_search', ['model' => $searchModel]); ?>

    <?= GridView::widget([
        'dataProvider' => $dataProvider,
        'filterModel' => $searchModel,
        'columns' => [
            ['class' => 'yii\grid\SerialColumn'],

            'id',
            'Nombre',
            'password',
            [
                'class' => ActionColumn::className(),
                'urlCreator' => function ($action, common\models\Propietarios $model, $key, $index, $column) {
                    return Url::toRoute([$action, 'id' => $model->id]);
                 }
            ],
        ],
    ]); ?>


</div>
