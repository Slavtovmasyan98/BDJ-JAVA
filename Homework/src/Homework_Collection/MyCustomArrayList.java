public class MyCustomArrayList {

    public static int Capacity = 10;
    private String[] data;
    private int index;


    public MyCustomArrayList(){
        this.data = new String[Capacity];
        this.index = 0;


    }

    public  void add(String element){

        this.data[this.index]= element;
        this.index++;

        if (this.index == Capacity){
              this.data = new String[Capacity+1];
            for (int i = 0; i < data.length ; i++) {
                this.data[i] = this.data[i];
            }

        }

    }

    public String get(int i ){
        if(i >= this.index){
            throw new IllegalArgumentException("Index to big");
        }
        if(i < 0){
            throw new IllegalArgumentException("Index to small");
        }
        return this.data[i];
    }



    public int size() {
        return this.index;


    }
    public boolean isEmpty() {
//        if (this.index == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return this.index==0;
    }
        public void remove(int removeIndex){
            for (int i = removeIndex; i < this.index-1; i++) {
                this.data[i] = this.data[i+1];
            }
            this.data[index] = null;
            this.index--;
        }

    }


