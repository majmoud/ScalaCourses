package courses.beginner.Scala2LanguageGettingStarted

import java.time._

object DateCourse extends App{

        /**
         * Utilisation de LocalDate
         */
        val d1=LocalDate.now()
        val d2=LocalDate.of(2023,3,23)

        /**
         * Utilisation de LocalTime
         */
        val t1=LocalTime.now()
        val t2=LocalTime.of(15,25,15,20)

        /**
         * Utilisation de LocalDateTime
         */
        val dt1=LocalDateTime.now()
        val dt2=LocalDateTime.of(2023,3,23,15,25,15,27)
        dt1.plusYears(20)
        dt1.plusMonths(20)
        dt1.minusDays(20)

        dt1.isAfter(dt2)
        dt1.isBefore(dt2)

        /**
         * Utilisation de ZonedDateTime
         */
        val z1=ZonedDateTime.now()

        // Liste toutes les zones ID disponibles
        ZoneId.getAvailableZoneIds()

        val z2=ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("Europe/London"))

        z1.isAfter(z2)
        z1.getMonth
        z1.getYear
        z1.plusYears(2)


        }
