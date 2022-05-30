<?php

namespace common\models;

use yii\base\Model;
use yii\data\ActiveDataProvider;
use common\models\Servicios;

/**
 * ServiciosSearch represents the model behind the search form of `common\models\Servicios`.
 */
class ServiciosSearch extends Servicios
{
    /**
     * {@inheritdoc}
     */
    public function rules()
    {
        return [
            [['id', 'cuidador', 'mascota'], 'integer'],
            [['fecha', 'nombre'], 'safe'],
            [['duracion'], 'number'],
        ];
    }

    /**
     * {@inheritdoc}
     */
    public function scenarios()
    {
        // bypass scenarios() implementation in the parent class
        return Model::scenarios();
    }

    /**
     * Creates data provider instance with search query applied
     *
     * @param array $params
     *
     * @return ActiveDataProvider
     */
    public function search($params)
    {
        $query = Servicios::find();

        // add conditions that should always apply here

        $dataProvider = new ActiveDataProvider([
            'query' => $query,
        ]);

        $this->load($params);

        if (!$this->validate()) {
            // uncomment the following line if you do not want to return any records when validation fails
            // $query->where('0=1');
            return $dataProvider;
        }

        // grid filtering conditions
        $query->andFilterWhere([
            'id' => $this->id,
            'cuidador' => $this->cuidador,
            'mascota' => $this->mascota,
            'fecha' => $this->fecha,
            'duracion' => $this->duracion,
        ]);

        $query->andFilterWhere(['like', 'nombre', $this->nombre]);

        return $dataProvider;
    }
}
