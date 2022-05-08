<?php

use \yii\db\Mascotas;

class m220505_000002_mascotas.php extends Migration
{
    public function up()
    {
       $this->createTable('cuidadores',[
			'id'=> $this->TYPE_PK,
			'Nombre'=>$this->TYPE_STRING ,
			'propietario'=>$this->TYPE_STRING 
		])
    }

    public function down()
    {
        $this->dropColumn('{{%user}}', 'mascotas');
    }
}
