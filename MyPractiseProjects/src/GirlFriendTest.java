import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GirlFriendTest {

    @Test
    void testGirlFriend() {
        LekkiBoyFriend lekkiBoyFriend = new LekkiBoyFriend();
        MushinBoyfriend mushinBoyfriend = new MushinBoyfriend();
        YabaBoyfriend yabaBoyfriend = new YabaBoyfriend();
        GirlFriend girlFriend = new GirlFriend(lekkiBoyFriend);
        girlFriend.last();
        girlFriend.care();
        girlFriend.spend();
        girlFriend.setBoyFriend(mushinBoyfriend);
        girlFriend.last();
        girlFriend.care();
        girlFriend.spend();
        girlFriend.setBoyFriend(yabaBoyfriend);
        girlFriend.last();
        girlFriend.care();
        girlFriend.spend();

    }


}