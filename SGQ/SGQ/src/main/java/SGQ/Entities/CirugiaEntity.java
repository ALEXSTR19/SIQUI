package SGQ.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cirugia")
public class CirugiaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String fecha;

    private int numcirugia;

    private int numquirofano;

    private int numexpediente;

    private String paciente;

    private String paterno;

    private String materno;

    private String inianestesia;

    private String teranestesia;

    private String medicamento;

    private String suturas;

    private String material;


    private String anestesiologo;


    private String enfermera_Circulante;


    private String cirujano;


    private String enfermera_Instrumentista;


    private String interno;

    private String apoyoexterno;

    private String medico_ayudante;

    private String nombrecirugia;

    private String anestesia;


    private String tipo_cirugia;

    private String status;
}




