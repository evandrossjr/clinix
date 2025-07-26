package com.essj.clinix;

import com.essj.clinix.models.Doctor;
import com.essj.clinix.models.enums.DayOfWeekBR;
import com.essj.clinix.models.enums.Role;
import com.essj.clinix.models.enums.Specialty;
import com.essj.clinix.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Set;

@Configuration
public class DataLoader implements CommandLineRunner {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public void run(String... args) throws Exception {

        List<Doctor> doctors = List.of(
                new Doctor(null, "Alice Fernandes", "alicef", "1234", "10010010010", "alice@clinica.com", "7199991001", Set.of(Role.DOCTOR), 1010, Specialty.CLINICO_GERAL, Set.of(DayOfWeekBR.SEGUNDA, DayOfWeekBR.QUARTA)),
                new Doctor(null, "Bruno Silva", "brunos", "1234", "10010010011", "bruno@clinica.com", "7199991002", Set.of(Role.DOCTOR), 1011, Specialty.PEDIATRIA, Set.of(DayOfWeekBR.TERCA, DayOfWeekBR.QUINTA)),
                new Doctor(null, "Carla Lima", "carlal", "1234", "10010010012", "carla@clinica.com", "7199991003", Set.of(Role.DOCTOR), 1012, Specialty.CARDIOLOGIA, Set.of(DayOfWeekBR.QUARTA, DayOfWeekBR.SEXTA)),
                new Doctor(null, "Diego Martins", "diegom", "1234", "10010010013", "diego@clinica.com", "7199991004", Set.of(Role.DOCTOR), 1013, Specialty.DERMATOLOGIA, Set.of(DayOfWeekBR.SEGUNDA, DayOfWeekBR.QUINTA)),
                new Doctor(null, "Eduarda Nunes", "eduardan", "1234", "10010010014", "eduarda@clinica.com", "7199991005", Set.of(Role.DOCTOR), 1014, Specialty.GINECOLOGIA, Set.of(DayOfWeekBR.TERCA, DayOfWeekBR.QUARTA)),
                new Doctor(null, "Felipe Torres", "felipet", "1234", "10010010015", "felipe@clinica.com", "7199991006", Set.of(Role.DOCTOR), 1015, Specialty.ORTOPEDIA, Set.of(DayOfWeekBR.QUARTA, DayOfWeekBR.SEXTA)),
                new Doctor(null, "Giovana Souza", "giovanas", "1234", "10010010016", "giovana@clinica.com", "7199991007", Set.of(Role.DOCTOR), 1016, Specialty.NEUROLOGIA, Set.of(DayOfWeekBR.SEGUNDA, DayOfWeekBR.TERCA)),
                new Doctor(null, "Henrique Castro", "henriquec", "1234", "10010010017", "henrique@clinica.com", "7199991008", Set.of(Role.DOCTOR), 1017, Specialty.PSIQUIATRIA, Set.of(DayOfWeekBR.QUINTA, DayOfWeekBR.SEXTA)),
                new Doctor(null, "Isabela Rocha", "isabelar", "1234", "10010010018", "isabela@clinica.com", "7199991009", Set.of(Role.DOCTOR), 1018, Specialty.OFTALMOLOGIA, Set.of(DayOfWeekBR.QUARTA, DayOfWeekBR.QUINTA)),
                new Doctor(null, "João Pedro", "joaop", "1234", "10010010019", "joao@clinica.com", "7199991010", Set.of(Role.DOCTOR), 1019, Specialty.OTORRINOLARINGOLOGIA, Set.of(DayOfWeekBR.SEGUNDA, DayOfWeekBR.SEXTA)),
                new Doctor(null, "Karen Ramos", "karenr", "1234", "10010010020", "karen@clinica.com", "7199991011", Set.of(Role.DOCTOR), 1020, Specialty.ENDOCRINOLOGIA, Set.of(DayOfWeekBR.TERCA, DayOfWeekBR.QUINTA)),
                new Doctor(null, "Lucas Almeida", "lucasa", "1234", "10010010021", "lucas@clinica.com", "7199991012", Set.of(Role.DOCTOR), 1021, Specialty.GASTROENTEROLOGIA, Set.of(DayOfWeekBR.SEGUNDA, DayOfWeekBR.QUARTA)),
                new Doctor(null, "Mariana Teixeira", "marianat", "1234", "10010010022", "mariana@clinica.com", "7199991013", Set.of(Role.DOCTOR), 1022, Specialty.UROLOGIA, Set.of(DayOfWeekBR.QUARTA, DayOfWeekBR.QUINTA)),
                new Doctor(null, "Nathan Costa", "nathanc", "1234", "10010010023", "nathan@clinica.com", "7199991014", Set.of(Role.DOCTOR), 1023, Specialty.REUMATOLOGIA, Set.of(DayOfWeekBR.QUINTA, DayOfWeekBR.SEXTA)),
                new Doctor(null, "Olívia Vasconcelos", "oliviav", "1234", "10010010024", "olivia@clinica.com", "7199991015", Set.of(Role.DOCTOR), 1024, Specialty.INFECTOLOGIA, Set.of(DayOfWeekBR.TERCA, DayOfWeekBR.SEXTA)),
                new Doctor(null, "Paulo César", "pauloc", "1234", "10010010025", "paulo@clinica.com", "7199991016", Set.of(Role.DOCTOR), 1025, Specialty.HEMATOLOGIA, Set.of(DayOfWeekBR.QUARTA, DayOfWeekBR.SEXTA)),
                new Doctor(null, "Quezia Matos", "queziaq", "1234", "10010010026", "quezia@clinica.com", "7199991017", Set.of(Role.DOCTOR), 1026, Specialty.ONCOLOGIA, Set.of(DayOfWeekBR.SEGUNDA, DayOfWeekBR.QUARTA)),
                new Doctor(null, "Rafael Moreira", "rafaelm", "1234", "10010010027", "rafael@clinica.com", "7199991018", Set.of(Role.DOCTOR), 1027, Specialty.NEFROLOGIA, Set.of(DayOfWeekBR.TERCA, DayOfWeekBR.QUINTA)),
                new Doctor(null, "Sabrina Farias", "sabrinaf", "1234", "10010010028", "sabrina@clinica.com", "7199991019", Set.of(Role.DOCTOR), 1028, Specialty.PNEUMOLOGIA, Set.of(DayOfWeekBR.QUARTA, DayOfWeekBR.QUINTA)),
                new Doctor(null, "Thiago Lopes", "thiagol", "1234", "10010010029", "thiago@clinica.com", "7199991020", Set.of(Role.DOCTOR), 1029, Specialty.ANESTESIOLOGIA, Set.of(DayOfWeekBR.SEGUNDA, DayOfWeekBR.QUINTA))
        );
        doctors.forEach(doctorRepository::save);
    }

}
