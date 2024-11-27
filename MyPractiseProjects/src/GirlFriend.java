public class GirlFriend {
    private BoyFriend boyFriend;

    public GirlFriend(BoyFriend boyFriend) {
        this.boyFriend = boyFriend;
    }


    public BoyFriend getBoyFriend() {
        return boyFriend;
    }

    public void setBoyFriend(BoyFriend boyFriend) {
        this.boyFriend = boyFriend;
    }

    public void last(){
        boyFriend.last();
    }

    public void care(){
        boyFriend.care();
    }

    public void spend(){
        boyFriend.spend();
    }
}
