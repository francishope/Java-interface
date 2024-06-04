package interfaces;



class computer{

    public class computer implements Electronic{

        RAM ram;

        Processor cpu;

        Storage storage;



        public Computer(RAM ram, Processor cpu, Storage storage){

        this.ram = ram;

        this.cpu = cpu;

        this.storage = Storage;

        }



        @override

        public String toString() {

            return "Computer{" +

                    "ram =" + ram +

                    "cpu =" + cpu +

                    " storage = " + storage;

            

                } 

        }



    

        public computer(ram ram, processor processor, storage storage) {

        //TODO Auto-generated constructor stub

    }





        public boolean on(){

            return true;

        }

        

}
