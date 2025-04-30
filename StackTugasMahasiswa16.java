public class StackTugasMahasiswa16{
    Mahasiswa16[] stack;
    int size;
    int top;

    public int Size() {
        return top + 1;
    }
    public StackTugasMahasiswa16(int size) {
        this.size = size;
        stack = new Mahasiswa16[size];
        top = -1;
    }
    public boolean isFull() {
        if(top == size -1){
            return true;
        }else{
            return false;   
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    public void push(Mahasiswa16 mhs){
        if(!isFull()){
            top++;
            stack[top] = mhs;
        }else{
            System.out.println("Stack penuh! Tidak bisa menambah tugas lagi.");
        }
    }
    public Mahasiswa16 pop(){
        if(!isEmpty()){
            return stack[top--];
        }else{
            System.out.println("Stack masih kosong.");
            return null;
        }
    }
    public Mahasiswa16 Bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack masih kosong.");
            return null;
        }
    }
    public Mahasiswa16 peek(){
        if(!isEmpty()){
            return stack[top];
        }else{
            System.out.println("Stack masih kosong.");
            return null;
        }
    }
    public String konversiDesimalKeBiner(int nilai){ 
        StackKonversi16 stack=new StackKonversi16();
        while(nilai > 0){
            int sisa = nilai %2;
            stack.push(sisa);
            nilai /= 2;
        }
        String biner = new String();
        while(!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }
    public void print(){
        for(int i = top; i >= 0; i-- ){
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas + "\t" );
        }
        System.out.println();
    }
}
