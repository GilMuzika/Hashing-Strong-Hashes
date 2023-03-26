package org.example;

import lombok.*;

import java.security.NoSuchAlgorithmException;
import java.util.Objects;

@RequiredArgsConstructor
public class MobilePhone {

    private HashCreator _hc = new HashCreator(HashingAlgorhitms.SHA256);
    @NonNull
    @Getter
    private String _phoneNumber;
    @NonNull
    @Getter
    private String _model;
    @NonNull
    @Getter
    private String _osVersion;
    @NonNull
    @Getter
    private float _size;

    @Override
    public String toString() {
        return String.format("The pone properties:\n Number: %s\nModel: %s\nOS Versopn: %s\n Size: %s", _phoneNumber, _model, _osVersion, _size);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MobilePhone that = (MobilePhone) o;
        return _phoneNumber.equals(that._phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_phoneNumber, _model, _osVersion, _size);
    }

    public String getStrongHash(){
        return _hc.createHash(_phoneNumber, _model, _osVersion, Float.toString(_size));
    }
}
