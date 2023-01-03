package lotto.domain;

import java.util.Objects;

public class SingleLottoNumber {
    private final int singleLottoNumber;
    private static final int MIN_LOTTO_NUMBER = 1;
    private static final int MAX_LOTTO_NUMBER = 45;

    public SingleLottoNumber(int singleLottoNumber) {
        if (singleLottoNumber < MIN_LOTTO_NUMBER || singleLottoNumber > MAX_LOTTO_NUMBER) {
            throw new IllegalArgumentException("로또의 각 숫자는 1이상 45 이하여야 합니다.");
        }

        this.singleLottoNumber = singleLottoNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SingleLottoNumber that = (SingleLottoNumber) o;
        return singleLottoNumber == that.singleLottoNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(singleLottoNumber);
    }
}
