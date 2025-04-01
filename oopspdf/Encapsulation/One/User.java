public class User {
     private long password;

     public User(long password){
        this.password=password;
     }
     int count=0;
        public void setPassword(long password){
            if(count==8){
                this.password = password;
            }
            else{
                System.out.println("invalid password");
            }
         
        }
        public long getPassword(){
            return password;
        }
        public static void main(String[] args) {
             User obj =new User(12345678);
             System.out.println(obj.getPassword());
             obj.setPassword(12345);
            System.out.println(obj.getPassword());
        }
}








