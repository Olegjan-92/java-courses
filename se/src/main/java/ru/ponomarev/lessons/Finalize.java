package ru.ponomarev.lessons;

class FDemo{
    long x;

    FDemo (long i){
        x=i;
    }
    protected void finalize(){
        System.out.println("Финализация "+x);
    }
    void  generator(long i){
        FDemo o = new FDemo(i);
    }
}

class Finalize{
    public static void main(String[] args) {
        long count;
        FDemo ob = new FDemo(0);
        for (count=1; count<208397l; count++){
            ob.generator(count);
        }
    }
}