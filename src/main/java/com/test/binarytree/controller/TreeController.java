package com.test.binarytree.controller;

import com.test.binarytree.model.AncestorsModel;
import com.test.binarytree.model.BinaryTreeModel;
import com.test.binarytree.model.TreeCreationDataModel;
import com.test.binarytree.service.BinaryTreeService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TreeController {

    @GetMapping("/tree")
    @ResponseBody
    public BinaryTreeModel createTree(@RequestParam int minValue, @RequestParam int maxValue, @RequestParam int maxNumberOfNodes) {      
    	TreeCreationDataModel treeCreationData = new TreeCreationDataModel(minValue,maxValue,maxNumberOfNodes);
        BinaryTreeService binaryTreeService = new BinaryTreeService();
        binaryTreeService.setCreationData(treeCreationData);
        return binaryTreeService.getBinaryTreeResponse();
    }

    @PostMapping("/tree/get-antecessors/{value1}/{value2}")
    @ResponseBody
    public AncestorsModel getAntecessors(@RequestBody BinaryTreeModel binaryTreeModel, @PathVariable int value1, @PathVariable int value2) {
        BinaryTreeService binaryTreeService = new BinaryTreeService();
        binaryTreeService.setBinaryTreeForModel(binaryTreeModel);
        AncestorsModel ancestorsModel = binaryTreeService.getAncestors(value1, value2);
        return ancestorsModel;
    }
}
