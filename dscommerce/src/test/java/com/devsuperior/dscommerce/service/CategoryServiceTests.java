package com.devsuperior.dscommerce.service;

import com.devsuperior.dscommerce.dto.CategoryDTO;
import com.devsuperior.dscommerce.entities.Category;
import com.devsuperior.dscommerce.repositories.CategoryRepository;
import com.devsuperior.dscommerce.services.CategoryService;
import com.devsuperior.dscommerce.tests.CategoryFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class CategoryServiceTests {

    @InjectMocks
    private CategoryService service;

    @Mock
    private CategoryRepository repository;

    private Category category;
    private List<Category> list;

    @BeforeEach
    void setUp() throws Exception {
        category = CategoryFactory.createCategory();

        list = new ArrayList<>();
        list.add(category);

        when(repository.findAll()).thenReturn(list);
    }

    @Test
    public void findAllShouldReturnListCategoryDTO() {

        List<CategoryDTO> result = service.findAll();

        Assertions.assertEquals(result.size(), 1);
        Assertions.assertEquals(result.getFirst().getId(), category.getId());
        Assertions.assertEquals(result.getFirst().getName(), category.getName());
    }

}
