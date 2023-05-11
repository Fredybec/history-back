package ma.sir.easystock.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.easystock.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "achat_history")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="achat_history_seq",sequenceName="achat_history_seq",allocationSize=1, initialValue = 1)
public class AchatHistory extends HistBusinessObject  {


    public AchatHistory() {
    super();
    }

    public AchatHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="achat_history_seq")
    public Long getId() {
    return id;
    }
}

