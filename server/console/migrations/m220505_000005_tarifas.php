	<?php

use \yii\db\Tarifas;

class m220505_000005_tarifas.php extends Migration
{
    public function up()
    {
        $this->createTable('tarifas',[
			
		])
    }

    public function down()
    {
        $this->dropColumn('{{%user}}', 'tarifas');
    }
}
