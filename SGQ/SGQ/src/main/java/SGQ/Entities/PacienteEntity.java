package SGQ.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Pacientes")
public class PacienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long Id;

    @Column
    private String Expediente;

    @Column
    private String Paciente;

    @Column
    private String Paterno;

    @Column
    private String Materno;

    @Column
    private String Sexo;

    @Column
    private Integer Edad;

    @Column
    private String Curp;

    @Column
    private String Domicilio;

    @Column
    private String Telefono;

    @Column
    private String Elabora;

    @Column
    private String Fecha;

    @Column
    private String Ubicacion;

    @Column
    private String Status;

    @Column
    @CreatedDate
    private Date CreatedAt;


}
