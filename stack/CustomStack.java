public class CustomStack {
        private int[] Stack;
        private int top;
        private int maxSize;
    
        public CustomStack(int maxSize) {
            this.maxSize=maxSize;
            this.Stack=new int[maxSize];
            this.top=-1;
        }
        
        public void push(int x) {
    
            if(top<maxSize-1){
                
                Stack[++top]=x;
            }
            else{
                System.out.println("overflow");
            }
        }
        
        public int pop() {
            if(top==-1){
                return -1;
            }
            else{
                int result = Stack[top];
            top--;
            return result;
    
            }
            
        }
        
        public void increment(int k, int val) {
             int end = Math.min(k - 1, top);
            for (int i = 0; i <= end; i++) {
                Stack[i] += val;
            }
        }
        public static void main(String[] args) {
            CustomStack stack=new CustomStack(5);
            stack.push(5);
            stack.push(9);
            stack.push(34);
            stack.push(98);
            stack.push(7);
            stack.push(87);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());


        }
            
            }
      
    
