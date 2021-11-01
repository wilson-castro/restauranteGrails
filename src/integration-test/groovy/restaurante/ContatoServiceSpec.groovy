package restaurante

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ContatoServiceSpec extends Specification {

    ContatoService contatoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Contato(...).save(flush: true, failOnError: true)
        //new Contato(...).save(flush: true, failOnError: true)
        //Contato contato = new Contato(...).save(flush: true, failOnError: true)
        //new Contato(...).save(flush: true, failOnError: true)
        //new Contato(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //contato.id
    }

    void "test get"() {
        setupData()

        expect:
        contatoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Contato> contatoList = contatoService.list(max: 2, offset: 2)

        then:
        contatoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        contatoService.count() == 5
    }

    void "test delete"() {
        Long contatoId = setupData()

        expect:
        contatoService.count() == 5

        when:
        contatoService.delete(contatoId)
        sessionFactory.currentSession.flush()

        then:
        contatoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Contato contato = new Contato()
        contatoService.save(contato)

        then:
        contato.id != null
    }
}
