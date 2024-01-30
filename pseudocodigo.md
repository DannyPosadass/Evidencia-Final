Clase Usuario
    Atributos:
        identificador
        contraseña

    Métodos:
        verificarCredenciales()

Fin Clase

Clase Administrador hereda de Usuario
    Atributos:
        permisosAdministrativos

    Métodos:
        gestionarDoctores()
        gestionarPacientes()
        gestionarCitas()

Fin Clase

Clase Persona
    Atributos:
        nombre
        fechaNacimiento

    Métodos:
        obtenerNombre()
        obtenerEdad()

Fin Clase

Clase Doctor hereda de Persona
    Atributos:
        especialidad

    Métodos:
        asignarCita(cita: Cita)
        obtenerEspecialidad()

Fin Clase

Clase Paciente hereda de Persona
    Atributos:
        historialMedico

    Métodos:
        obtenerHistorialMedico()

Fin Clase

Clase Cita
    Atributos:
        fecha
        hora
        doctor: Doctor
        paciente: Paciente

    Métodos:
        asignarDoctor(doctor: Doctor)
        asignarPaciente(paciente: Paciente)
        obtenerFechaHora()

Fin Clase

Interfaz ControlAcceso
    Métodos:
        solicitarCredenciales()
        verificarCredenciales()

Fin Interfaz

Clase Principal implementa ControlAcceso
    Atributos:
        listaDoctores
        listaPacientes
        listaCitas

    Métodos:
        menuPrincipal()
        altaDoctor()
        altaPaciente()
        crearCita()
        relacionarCita()
        salir()

Fin Clase
