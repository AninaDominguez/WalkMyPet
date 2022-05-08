<?php

use \yii\db\Paises;

class m220505_000003_paises.php extends Migration
{
    public function up()
    {
        $this->createTable('paises',[
			'id'=> $this->TYPE_PK,
			'Codigo'=>$this->TYPE_STRING ,
			'Nombre'=>$this->TYPE_STRING 
		])
    }

    public function down()
    {
        $this->dropColumn('{{%user}}', 'paises');
    }
}
