package HealingToolManagement;

public abstract class HealingTool {

        String name;
        int healingPower;

        public HealingTool(String name, int healingPower) {
            this.name = name;
            this.healingPower = healingPower;
        }

        public String getName(){
            return this.name;
        }

        public int getHealingPower(){
            return this.healingPower;
        }


}


