package rs.raf.library.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import rs.raf.library.domain.dto.QuoteDto;

@FeignClient(name = "quotes", url = "http://185.26.117.147:8080/quotes")
public interface QuoteFeignClient {

	@RequestMapping(value = "/quotes/getQuote", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody QuoteDto getQuote();
}
