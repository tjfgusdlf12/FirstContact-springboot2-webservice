package com.alphaka.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor/*lombok의 어노테이션*/
@Getter           /*lombok의 어노테이션*/
@Entity           /*Entity는 JPA의 어노테이션*/
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500 , nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    /****************************************************필기 노트*******************************************************
     * Lombok은 코드를 단순화 시켜 주지만 필수 어노테이션이 아님                                                              *
     * 그러다보니 주요 어노테이션인 Entity를 클래스에 가깝게 두고, 롬복 어노테이션을 그위에 둠.                                    *
     * 이렇게 하면 이후에 코틀린 등의 새 언어 전환으로 롬복이 더이상 필요 없을 결루 쉽게 삭제가 가능함                               *
     *                                                                                                                *
     *                                                                                                                *
     * 여기서 Posts 클래스는 실제 DB의 테이블과 매칭될 클래스이며 보통                                                         *
     *                                              Entity 클라스라고도 함                                               *
     *                                                                                                                *
     * 실제로 JPA를 사용하면서 DB 테이블에 작업 할 경우 실제 쿼리를 날리기보다는 이 Entity 클래스의 수정을 통해 작업을 한다.           *
     *                                                                                                                *
     *                                                                                                                *
     * @Entity---테이블과 링크될 클래스임을 나타냅니다.                                                                      *
     *        ---기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍(_)으로 테이블 이름을 캐칭함                                *
     *        ---EX) SalesManager java -------> sales_manager table                                                   *
     *                                                                                                                *
     * @Id    ---해당 테이블의 PK 필드를 나타냅니다.                                                                       *
     *                                                                                                                *
     * @GeneratedValue
     *        ---PK의 새성 규칙을 나타냅니다.
     *        ---스프링부트 2.0에서는
     *                              GenerationType.IDENTITY
     *                                                      라는 옵션을 추가해야함 auto_increment가 됩니다.
     *        ---스프링부트 2.0버전과 1.5버전의 차이는 https://jojoldu.tistory.coom/295에 정리되어 있으니 참조 ㄱㄱ
     *
     * @Column---테이블의 컬럼을 나타내며 굳이 선언하지 않더라고 해당 클래스의 필드는 모두 컬럼이 됩니다.
     *        ---사용하는 이유는, 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용합니다.
     *        ---문자열의 경우 VARCHAR(255)가 기본인데, 사이지를 500으로 늘리고 싶거나
     *              EX)title, 타입을 TEXT로 변경하고 싶거나(EX:content)등의 경우에 사용됩니다.
     */
}
