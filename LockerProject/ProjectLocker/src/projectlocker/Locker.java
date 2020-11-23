/**
 * @author Chichaya marod
 */
package projectlocker;

/*
*It has lockerId ,status ,keep a pass
 */
public class Locker {

    /**
     * this is a lockerId attribute*
     */
    private int lockerId;
    /**
     * this is a status attribute, set status locker is avalable*
     */
    private StatusLocker status = StatusLocker.AVALIABLE;
    /**
     * this is a pass attribute*
     */
    private String pass;

    /**
     * @param value at specified of the number in method.
     */
    public Locker(int lockerId) {
        this.lockerId = lockerId;
    }

    /**
     * @return lockerId of the locker
     */
    public int getLockerId() {
        return lockerId;
    }

    /**
     * @return status to the locker
     */
    public StatusLocker getStatus() {
        return status;
    }

    /**
     * @param lockerId set the lockerId
     */
    public void setLockerId(int lockerId) {
        this.lockerId = lockerId;
    }

    /**
     * @param status set to the lockerId
     */
    public void setStatus(StatusLocker status) {
        this.status = status;
    }

    /**
     * @return pass of the lockerId
     */
    public String getPass() {
        return pass;
    }

    /**
     *
     * @param pass set to the lockerId
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return lockerId and status show results
     */
    @Override
    public String toString() {
        return "[" + "No." + "|" + " " + lockerId + " " + status + ']'; //ไม่มีคนเช่า
    }
}
