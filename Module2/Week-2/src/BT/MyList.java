package BT;

import java.util.Arrays;

public class MyList<T> {
    private int size=0;
    private int DEFAULT_SIZE=1;
    private T[] element;

    public MyList(){
        this.element=(T[])new Object[DEFAULT_SIZE];
    }
    public MyList(int capa){
        this.DEFAULT_SIZE=capa;
        this.element=(T[]) new Object[this.DEFAULT_SIZE];
    }
    public void add(int index,T element){
        if(index >=0 && index < DEFAULT_SIZE){
            this.increseCap();
            if (this.element[index] != null) {

                for (int i = this.DEFAULT_SIZE - 2; i >= index; i--) {
                    this.element[i + 1] = this.element[i];
                }
            }
            this.element[index]=element;
        }
    }

    public void add(T element){
        this.increseCap();
        this.element[this.DEFAULT_SIZE-2]=element;
    }
    public T get(int index){
        return this.element[index];
    }

    public void increseCap(){
        this.DEFAULT_SIZE+=1;
        this.element=Arrays.copyOf(this.element,this.DEFAULT_SIZE);
    }
    public void descreCap(){
        this.DEFAULT_SIZE-=1;
        this.element=Arrays.copyOf(this.element,this.DEFAULT_SIZE);
    }

    public int getDEFAULT_SIZE(){
        return this.DEFAULT_SIZE;
    }

    public void remove(int index) throws Exception {
        if(index >=0 && index<this.DEFAULT_SIZE){
            this.descreCap();
            T temp=this.element[index];
            for (int i =index;i<this.DEFAULT_SIZE-1;i++){
                this.element[i]=this.element[i+1];
            }

        }else{
            throw new Exception("Can't remove");
        }
    }

    public T[] clone(){
        return this.element;
    }

    public boolean contains(T element){
        boolean checked=false;

        for (int i=0;i<this.DEFAULT_SIZE;i++){
            if(this.element[i].equals(element)){
                checked=true;
                return checked;
            }
        }
        return checked;
    }

    public int indexOf(T element){
        for (int i=0 ;i<this.getDEFAULT_SIZE();i++){
            if (this.element[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

}
