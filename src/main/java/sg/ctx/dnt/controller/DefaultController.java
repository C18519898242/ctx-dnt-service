package sg.ctx.dnt.controller;

import sg.ctx.dnt.domain.ReturnCodeEnum;
import sg.ctx.dnt.model.response.CodeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author yumiao
 */
@RestController
public class DefaultController {
    @GetMapping("/index")
    @ResponseBody
    public ResponseEntity index(HttpServletResponse response){
        var codeResponse = new CodeResponse(ReturnCodeEnum.OK);
        codeResponse.setData("Dnt Service");
        codeResponse.setMessage("Index");
        return ResponseEntity.ok(codeResponse);
    }
}
