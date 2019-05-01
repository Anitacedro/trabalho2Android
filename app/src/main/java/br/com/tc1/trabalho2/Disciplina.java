package br.com.tc1.trabalho2;

import android.os.Parcel;
import android.os.Parcelable;

public class Disciplina implements Parcelable {
    public Integer codigo;
    public Integer cargaHoraria;
    public String descricao;

    protected Disciplina(Parcel in) {
        codigo = in.readInt();
        cargaHoraria = in.readInt();
        descricao = in.readString();
    }

    public static final Creator<Disciplina> CREATOR = new Creator<Disciplina>() {
        @Override
        public Disciplina createFromParcel(Parcel in) {
            return new Disciplina(in);
        }

        @Override
        public Disciplina[] newArray(int size) {
            return new Disciplina[size];
        }
    };

    public Disciplina() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(codigo);
        dest.writeInt(cargaHoraria);
        dest.writeString(descricao);
    }

    public Double convertCargaHora() {
        Double hora = (double) this.cargaHoraria * 50 /  60;
        return hora;
    }

    @Override
    public String toString() {
        return this.descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
