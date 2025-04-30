public class stackSurat16 {
    Surat16[] stack;
    int top;
    int size;

    public stackSurat16(int size) {
        this.size = size;
        stack = new Surat16[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat16 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("surat berhasil diterima.");
        } else {
            System.out.println("Stack surat penuh. Tidak bisa menambahkan surat baru.");
        }
    }

    public Surat16 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat16 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}