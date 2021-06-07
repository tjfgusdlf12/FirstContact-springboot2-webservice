package com.alphaka.book.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬북_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);  //assertThat라는 테스트 검증 라이브러리의 검증 메서드입니다.
                                                    //검증하고 싶은 대상을 메소드 인자로 받습니다.
                                                    //메소드 체이닝이 지원되어 isEqualTo와 같이 메소드를 이어서 사용할 수 있습니다.

                                    //isEqualTo     assertj의 동등 비교 메소드입니다.
                                    //              assertThat에 있는 값과 isEqualTo의 값을 비교해서 같을 때만 성공입니다.
        assertThat(dto.getAmount()).isEqualTo(amount);


        //필자는 Junit의 기본 aeertThat이 아닌 assertj의 assertThat을 사용
        //assertj 역시 Junit에서 자동으로 라이브러리 등록을 해줌

        //junit과 비교하여 assertj의 잠정
        //=>CoreMatchers와 달리 추가적으로 라이브러리가 필요하지 않습니다.
        //      =>junit의 assertThat을 쓰게 되면 is()와 같이 CoreMatchers 라이브러리가 필요합니다.
        //
        //=>자동완성이 좀 더 확실하게 지원됩니다.
        //      =>IDE에서는 CoreMatchers와 같은 Matcher 라이브러리의 자동완성 지원이 약합니다.

    }
}
