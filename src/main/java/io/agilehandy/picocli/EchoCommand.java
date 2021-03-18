/*
 * Copyright 2013-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.agilehandy.picocli;

import java.util.concurrent.Callable;

import picocli.CommandLine;

import org.springframework.stereotype.Component;

/**
 * @author : Haytham Mohamed
 * @created : Wednesday 3/17/21
 **/

@Component
@CommandLine.Command(name = "echoo", mixinStandardHelpOptions = true, version = "echoo 4.0",
		description = "Echo back a message to STDOUT.")
public class EchoCommand implements Callable<Integer> {

	@CommandLine.Option(names = {"-o", "--option"}, description = "To capitalize (yes, no)")
	private String capitalize = "yes";

	@CommandLine.Parameters(index = "0", description = "A message to echo.")
	private String message;


	@Override
	public Integer call() throws Exception {
		if (capitalize.equalsIgnoreCase("yes"))
			System.out.println("message: " + message.toUpperCase());
		else
			System.out.println("message: " + message.toLowerCase());
		return 0;
	}
}
