package cholog;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListStudy {

    @Test
    public void arrayList() {
        ArrayList<String> values = new ArrayList<>();
        values.add("first");
        values.add("second");

        Assertions.assertAll(
                () -> assertThat(values.add("third")).isTrue(), // 세 번째 값을 추가한다.
                () -> assertThat(values.size()).isEqualTo(3), // list의 크기를 구한다.
                () -> assertThat(values.get(0)).isEqualTo("first"), // 첫 번째 값을 찾는다.
                () -> assertThat(values.contains("first")).isTrue(), // "first" 값이 포함되어 있는지를 확인한다.
                () -> assertThat(values.remove(0)).isEqualTo("first"), // 첫 번째 값을 삭제한다.
                () -> assertThat(values.size()).isEqualTo(2) // 값이 삭제 됐는지 확인한다.
        );

        // TODO values에 담긴 모든 값을 출력한다.
    }
}