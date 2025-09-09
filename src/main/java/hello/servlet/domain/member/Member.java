package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {

    private Long id; //회원 저장소에 저장하면 아이디 발급될 것
    private String username;
    private int age;

    public Member(){}

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
