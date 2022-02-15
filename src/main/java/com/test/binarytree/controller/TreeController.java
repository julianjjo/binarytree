package com.test.binarytree.controller;

import com.test.binarytree.model.BinaryTreeModel;
import com.test.binarytree.model.TreeCreationDataModel;
import com.test.binarytree.service.BinaryTreeService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TreeController {

    @GetMapping("/tree")
    @ResponseBody
    public BinaryTreeModel tree(@RequestParam int minValue, @RequestParam int maxValue, @RequestParam int maxNumberOfNodes) {      
    	TreeCreationDataModel treeCreationData = new TreeCreationDataModel(minValue,maxValue,maxNumberOfNodes);
        BinaryTreeService binaryTreeService = new BinaryTreeService(treeCreationData);

        return binaryTreeService.getBinaryTreeResponse();
    }
}
