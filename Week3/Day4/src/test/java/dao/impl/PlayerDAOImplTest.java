package dao.impl;

import exception.BusinessException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerDAOImplTest extends PlayerDAOImpl{

    @Test
    void updatePlayer() throws BusinessException {
        assertEquals(1, updatePlayer(100, 987654321L));
    }
}