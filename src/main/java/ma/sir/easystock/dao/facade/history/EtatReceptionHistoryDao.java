package ma.sir.easystock.dao.facade.history;

import ma.sir.easystock.zynerator.repository.AbstractHistoryRepository;
import ma.sir.easystock.bean.history.EtatReceptionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatReceptionHistoryDao extends AbstractHistoryRepository<EtatReceptionHistory,Long> {

}
