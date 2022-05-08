	<?php

use \yii\db\Servicios;

class m220505_000004_servicios.php extends Migration
{
    public function up()
    {
        $this->createTable('servicios',[
			'id'=> $this->primaryKey(),
			'cuidador'=>$this->string() ,
			'mascota'=>$this->string(), 
			'fecha'=>$this->dateTime(),
			'duracion'=>$this->integer(),
			'nombre'=>$this->string(), 
		])
    }

    public function down()
    {
        $this->dropColumn('{{%user}}', 'servicios');
    }
}
