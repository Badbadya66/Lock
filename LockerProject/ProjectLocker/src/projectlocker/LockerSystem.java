package projectlocker;
/**
 * @author Orawan Srakaew
 * It has arrayLocker sizeLocker lockerId
 */
public class LockerSystem {
    /**
     * locker is attribute array
     */
    private Locker locker[];
    /**
     * this is a size attribute
     */
    private int size;
    /**
     * temp_locker is attribute
     */
    private Locker temp_locker;
    /**
     * this is a lockerId attribute start value one
     */
    private int lockerId = 1;
    
    /**
     * @param Size this locker is array 
     * 
     */
    public LockerSystem(int Size) {
        this.locker = new Locker[Size];
        this.size = Size;
        addLocker();
    }
    
    public void addLocker(){
        for (int i = 0; i < size; i++) {
            this.locker[i] = temp_locker = new Locker(lockerId++);
        }
    }
    
    public boolean checkLocker(int id){
        id--;
        return locker[id].getStatus() != StatusLocker.UNVALIABLE;
    }
    
    public String getLockerList(){
        String locker = "";
        int count = 1;
        for (int i = 0; i < this.size; i++) {
            if(this.locker[i] != null){
            locker += this.locker[i];
            }
            count++;
            if(count > 3){
                locker += "\n";
                count = 1;
            }
        }
        return locker;
    }
    
    public boolean CheckPass(int id, String pass){
      id--;
      return  locker[id].getPass().equals(pass);
    }
    
    public void rentLocker(int id,String pass){
        id--;
        this.locker[id].setStatus(StatusLocker.UNVALIABLE);
        this.locker[id].setPass(pass);
    }
    
    public void returnLocker(int id){
        id--;
        this.locker[id].setStatus(StatusLocker.AVALIABLE);
        this.locker[id].setPass(null);
    }
}
