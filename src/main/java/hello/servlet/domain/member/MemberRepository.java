package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {

    //HashMap은 동시성 문제가 고려되어 있지 않음
    //실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence=0L;

    //싱글톤으로 만들 것임
    //톰캣 띄울 때만 스프링 컨테이너를 쓰는 거고 그 외에는 안쓰기 때문에
    private static final MemberRepository instance=new MemberRepository();

    public static MemberRepository getInstance(){
        return instance;
    }

    //싱글톤으로 만들 때에는 private으로 생성자를 막아야 함
    private MemberRepository(){}

    public Member save(Member member){
        member.setId(++sequence);
        store.put(member.getId(), member);

        return member;
    }

    public Member findById(Long id){
        return store.get(id);
    }

    public List<Member> findAll(){
        //store에 있는 모든 값들을 다 꺼내서 새로운 arrayList에 담아서 넘겨줌
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }
}