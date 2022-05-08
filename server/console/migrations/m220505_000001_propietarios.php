<?php

use \yii\db\Propietarios;

class m220505_000001_propietarios.php extends Migration
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
        $this->dropColumn('{{%user}}', 'propietarios');
    }
}
