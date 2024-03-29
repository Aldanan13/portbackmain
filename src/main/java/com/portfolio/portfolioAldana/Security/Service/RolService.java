
package com.portfolio.portfolioAldana.Security.Service;

import com.portfolio.portfolioAldana.Security.Entity.Rol;
import com.portfolio.portfolioAldana.Security.Enums.RolNombre;
import com.portfolio.portfolioAldana.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getBYRolNombre(RolNombre rolNom){
        return irolRepository.findByRolNombre(rolNom);
    }
    
    public void save (Rol rol){
        irolRepository.save(rol);
    }
}
