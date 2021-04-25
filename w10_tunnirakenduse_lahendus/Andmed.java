class Andmed<E>{
    E a[];
    int top;
    
        Andmed(){
        a=(E[])new Object[100];
        top=-1;
        }
    
        void push(E data){
        a[++top]=data;
        }
    
        E pop(){
        return a[top--];
        }
    
        boolean hasElements(){
        return top!=-1;
        }
     
    }