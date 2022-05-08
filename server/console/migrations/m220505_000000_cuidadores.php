<?php

use \yii\db\Cuidadores;

class m220505_000000_cuidadores.php extends Migration
{
    public function up()
    {
        $this->createTable('cuidadores',[
			'id'=> $this->TYPE_PK,
			'Nombre'=>$this->TYPE_STRING ,
			'password'=>$this->TYPE_STRING 
		])
    }

    public function down()
    {
        $this->dropColumn('{{%user}}', 'cuidadores');
    }
}
